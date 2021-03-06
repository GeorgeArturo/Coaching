package pdg.presentation.view;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;

import org.primefaces.event.RowEditEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pdg.exceptions.*;

import pdg.modelo.*;

import pdg.modelo.dto.SesCoachingDTO;

import pdg.presentation.businessDelegate.*;

import pdg.utilities.*;

import java.io.Serializable;

import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 * @author Zathura Code Generator http://zathuracode.org
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class SesCoachingView implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private static final Logger log = LoggerFactory.getLogger(SesCoachingView.class);
//    private InputText txtAccion;
//    private InputText txtCompromiso;
//    private InputText txtFocoSesion;
//    private InputText txtHora;
//    private InputText txtIdHis;
//    private InputText txtIndicador;
//    private InputText txtProfundidad;
//    private InputText txtIdEstado_Estado;
//    private InputText txtIdProc_ProcCoaching;
//    private InputText txtIdSesi;
//    private Calendar txtFecha;
//    private CommandButton btnSave;
//    private CommandButton btnModify;
//    private CommandButton btnDelete;
//    private CommandButton btnClear;
//    private List<SesCoachingDTO> data;
//    private SesCoachingDTO selectedSesCoaching;
//    private SesCoaching entity;
//    private boolean showDialog;
//    @ManagedProperty(value = "#{BusinessDelegatorView}")
//    private IBusinessDelegate businessDelegatorView;
//
//    public SesCoachingView() {
//        super();
//    }
//
//    public String action_new() {
//        action_clear();
//        selectedSesCoaching = null;
//        setShowDialog(true);
//
//        return "";
//    }
//
//    public String action_clear() {
//        entity = null;
//        selectedSesCoaching = null;
//
//        if (txtAccion != null) {
//            txtAccion.setValue(null);
//            txtAccion.setDisabled(true);
//        }
//
//        if (txtCompromiso != null) {
//            txtCompromiso.setValue(null);
//            txtCompromiso.setDisabled(true);
//        }
//
//        if (txtFocoSesion != null) {
//            txtFocoSesion.setValue(null);
//            txtFocoSesion.setDisabled(true);
//        }
//
//        if (txtHora != null) {
//            txtHora.setValue(null);
//            txtHora.setDisabled(true);
//        }
//
//        if (txtIdHis != null) {
//            txtIdHis.setValue(null);
//            txtIdHis.setDisabled(true);
//        }
//
//        if (txtIndicador != null) {
//            txtIndicador.setValue(null);
//            txtIndicador.setDisabled(true);
//        }
//
//        if (txtProfundidad != null) {
//            txtProfundidad.setValue(null);
//            txtProfundidad.setDisabled(true);
//        }
//
//        if (txtIdEstado_Estado != null) {
//            txtIdEstado_Estado.setValue(null);
//            txtIdEstado_Estado.setDisabled(true);
//        }
//
//        if (txtIdProc_ProcCoaching != null) {
//            txtIdProc_ProcCoaching.setValue(null);
//            txtIdProc_ProcCoaching.setDisabled(true);
//        }
//
//        if (txtFecha != null) {
//            txtFecha.setValue(null);
//            txtFecha.setDisabled(true);
//        }
//
//        if (txtIdSesi != null) {
//            txtIdSesi.setValue(null);
//            txtIdSesi.setDisabled(false);
//        }
//
//        if (btnSave != null) {
//            btnSave.setDisabled(true);
//        }
//
//        if (btnDelete != null) {
//            btnDelete.setDisabled(true);
//        }
//
//        return "";
//    }
//
//    public void listener_txtFecha() {
//        Date inputDate = (Date) txtFecha.getValue();
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        FacesContext.getCurrentInstance()
//                    .addMessage("",
//            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
//    }
//
//    public void listener_txtId() {
//        try {
//            Double idSesi = FacesUtils.checkDouble(txtIdSesi);
//            entity = (idSesi != null)
//                ? businessDelegatorView.getSesCoaching(idSesi) : null;
//        } catch (Exception e) {
//            entity = null;
//        }
//
//        if (entity == null) {
//            txtAccion.setDisabled(false);
//            txtCompromiso.setDisabled(false);
//            txtFocoSesion.setDisabled(false);
//            txtHora.setDisabled(false);
//            txtIdHis.setDisabled(false);
//            txtIndicador.setDisabled(false);
//            txtProfundidad.setDisabled(false);
//            txtIdEstado_Estado.setDisabled(false);
//            txtIdProc_ProcCoaching.setDisabled(false);
//            txtFecha.setDisabled(false);
//            txtIdSesi.setDisabled(false);
//            btnSave.setDisabled(false);
//        } else {
//            txtAccion.setValue(entity.getAccion());
//            txtAccion.setDisabled(false);
//            txtCompromiso.setValue(entity.getCompromiso());
//            txtCompromiso.setDisabled(false);
//            txtFecha.setValue(entity.getFecha());
//            txtFecha.setDisabled(false);
//            txtFocoSesion.setValue(entity.getFocoSesion());
//            txtFocoSesion.setDisabled(false);
//            txtHora.setValue(entity.getHora());
//            txtHora.setDisabled(false);
//            txtIdHis.setValue(entity.getIdHis());
//            txtIdHis.setDisabled(false);
//            txtIndicador.setValue(entity.getIndicador());
//            txtIndicador.setDisabled(false);
//            txtProfundidad.setValue(entity.getProfundidad());
//            txtProfundidad.setDisabled(false);
//            txtIdEstado_Estado.setValue(entity.getEstado().getIdEstado());
//            txtIdEstado_Estado.setDisabled(false);
//            txtIdProc_ProcCoaching.setValue(entity.getProcCoaching().getIdProc());
//            txtIdProc_ProcCoaching.setDisabled(false);
//            txtIdSesi.setValue(entity.getIdSesi());
//            txtIdSesi.setDisabled(true);
//            btnSave.setDisabled(false);
//
//            if (btnDelete != null) {
//                btnDelete.setDisabled(false);
//            }
//        }
//    }
//
//    public String action_edit(ActionEvent evt) {
//        selectedSesCoaching = (SesCoachingDTO) (evt.getComponent()
//                                                   .getAttributes()
//                                                   .get("selectedSesCoaching"));
//        txtAccion.setValue(selectedSesCoaching.getAccion());
//        txtAccion.setDisabled(false);
//        txtCompromiso.setValue(selectedSesCoaching.getCompromiso());
//        txtCompromiso.setDisabled(false);
//        txtFecha.setValue(selectedSesCoaching.getFecha());
//        txtFecha.setDisabled(false);
//        txtFocoSesion.setValue(selectedSesCoaching.getFocoSesion());
//        txtFocoSesion.setDisabled(false);
//        txtHora.setValue(selectedSesCoaching.getHora());
//        txtHora.setDisabled(false);
//        txtIdHis.setValue(selectedSesCoaching.getIdHis());
//        txtIdHis.setDisabled(false);
//        txtIndicador.setValue(selectedSesCoaching.getIndicador());
//        txtIndicador.setDisabled(false);
//        txtProfundidad.setValue(selectedSesCoaching.getProfundidad());
//        txtProfundidad.setDisabled(false);
//        txtIdEstado_Estado.setValue(selectedSesCoaching.getIdEstado_Estado());
//        txtIdEstado_Estado.setDisabled(false);
//        txtIdProc_ProcCoaching.setValue(selectedSesCoaching.getIdProc_ProcCoaching());
//        txtIdProc_ProcCoaching.setDisabled(false);
//        txtIdSesi.setValue(selectedSesCoaching.getIdSesi());
//        txtIdSesi.setDisabled(true);
//        btnSave.setDisabled(false);
//        setShowDialog(true);
//
//        return "";
//    }
//
//    public String action_save() {
//        try {
//            if ((selectedSesCoaching == null) && (entity == null)) {
//                action_create();
//            } else {
//                action_modify();
//            }
//
//            data = null;
//        } catch (Exception e) {
//            FacesUtils.addErrorMessage(e.getMessage());
//        }
//
//        return "";
//    }
//
//    public String action_create() {
//        try {
//            entity = new SesCoaching();
//
//            Double idSesi = FacesUtils.checkDouble(txtIdSesi);
//
//            entity.setAccion(FacesUtils.checkString(txtAccion));
//            entity.setCompromiso(FacesUtils.checkString(txtCompromiso));
//            entity.setFecha(FacesUtils.checkDate(txtFecha));
//            entity.setFocoSesion(FacesUtils.checkString(txtFocoSesion));
//            entity.setHora(FacesUtils.checkDouble(txtHora));
//            entity.setIdHis(FacesUtils.checkDouble(txtIdHis));
//            entity.setIdSesi(idSesi);
//            entity.setIndicador(FacesUtils.checkString(txtIndicador));
//            entity.setProfundidad(FacesUtils.checkString(txtProfundidad));
//            entity.setEstado((FacesUtils.checkDouble(txtIdEstado_Estado) != null)
//                ? businessDelegatorView.getEstado(FacesUtils.checkDouble(
//                        txtIdEstado_Estado)) : null);
//            entity.setProcCoaching((FacesUtils.checkDouble(
//                    txtIdProc_ProcCoaching) != null)
//                ? businessDelegatorView.getProcCoaching(FacesUtils.checkDouble(
//                        txtIdProc_ProcCoaching)) : null);
//            businessDelegatorView.saveSesCoaching(entity);
//            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);
//            action_clear();
//        } catch (Exception e) {
//            entity = null;
//            FacesUtils.addErrorMessage(e.getMessage());
//        }
//
//        return "";
//    }
//
//    public String action_modify() {
//        try {
//            if (entity == null) {
//                Double idSesi = new Double(selectedSesCoaching.getIdSesi());
//                entity = businessDelegatorView.getSesCoaching(idSesi);
//            }
//
//            entity.setAccion(FacesUtils.checkString(txtAccion));
//            entity.setCompromiso(FacesUtils.checkString(txtCompromiso));
//            entity.setFecha(FacesUtils.checkDate(txtFecha));
//            entity.setFocoSesion(FacesUtils.checkString(txtFocoSesion));
//            entity.setHora(FacesUtils.checkDouble(txtHora));
//            entity.setIdHis(FacesUtils.checkDouble(txtIdHis));
//            entity.setIndicador(FacesUtils.checkString(txtIndicador));
//            entity.setProfundidad(FacesUtils.checkString(txtProfundidad));
//            entity.setEstado((FacesUtils.checkDouble(txtIdEstado_Estado) != null)
//                ? businessDelegatorView.getEstado(FacesUtils.checkDouble(
//                        txtIdEstado_Estado)) : null);
//            entity.setProcCoaching((FacesUtils.checkDouble(
//                    txtIdProc_ProcCoaching) != null)
//                ? businessDelegatorView.getProcCoaching(FacesUtils.checkDouble(
//                        txtIdProc_ProcCoaching)) : null);
//            businessDelegatorView.updateSesCoaching(entity);
//            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
//        } catch (Exception e) {
//            data = null;
//            FacesUtils.addErrorMessage(e.getMessage());
//        }
//
//        return "";
//    }
//
//    public String action_delete_datatable(ActionEvent evt) {
//        try {
//            selectedSesCoaching = (SesCoachingDTO) (evt.getComponent()
//                                                       .getAttributes()
//                                                       .get("selectedSesCoaching"));
//
//            Double idSesi = new Double(selectedSesCoaching.getIdSesi());
//            entity = businessDelegatorView.getSesCoaching(idSesi);
//            action_delete();
//        } catch (Exception e) {
//            FacesUtils.addErrorMessage(e.getMessage());
//        }
//
//        return "";
//    }
//
//    public String action_delete_master() {
//        try {
//            Double idSesi = FacesUtils.checkDouble(txtIdSesi);
//            entity = businessDelegatorView.getSesCoaching(idSesi);
//            action_delete();
//        } catch (Exception e) {
//            FacesUtils.addErrorMessage(e.getMessage());
//        }
//
//        return "";
//    }
//
//    public void action_delete() throws Exception {
//        try {
//            businessDelegatorView.deleteSesCoaching(entity);
//            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
//            action_clear();
//            data = null;
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    public String action_closeDialog() {
//        setShowDialog(false);
//        action_clear();
//
//        return "";
//    }
//
//    public String action_modifyWitDTO(String accion, String compromiso,
//        Date fecha, String focoSesion, Double hora, Double idHis,
//        Double idSesi, String indicador, String profundidad,
//        Double idEstado_Estado, Double idProc_ProcCoaching)
//        throws Exception {
//        try {
//            entity.setAccion(FacesUtils.checkString(accion));
//            entity.setCompromiso(FacesUtils.checkString(compromiso));
//            entity.setFecha(FacesUtils.checkDate(fecha));
//            entity.setFocoSesion(FacesUtils.checkString(focoSesion));
//            entity.setHora(FacesUtils.checkDouble(hora));
//            entity.setIdHis(FacesUtils.checkDouble(idHis));
//            entity.setIndicador(FacesUtils.checkString(indicador));
//            entity.setProfundidad(FacesUtils.checkString(profundidad));
//            businessDelegatorView.updateSesCoaching(entity);
//            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
//        } catch (Exception e) {
//            //renderManager.getOnDemandRenderer("SesCoachingView").requestRender();
//            FacesUtils.addErrorMessage(e.getMessage());
//            throw e;
//        }
//
//        return "";
//    }
//
//    public InputText getTxtAccion() {
//        return txtAccion;
//    }
//
//    public void setTxtAccion(InputText txtAccion) {
//        this.txtAccion = txtAccion;
//    }
//
//    public InputText getTxtCompromiso() {
//        return txtCompromiso;
//    }
//
//    public void setTxtCompromiso(InputText txtCompromiso) {
//        this.txtCompromiso = txtCompromiso;
//    }
//
//    public InputText getTxtFocoSesion() {
//        return txtFocoSesion;
//    }
//
//    public void setTxtFocoSesion(InputText txtFocoSesion) {
//        this.txtFocoSesion = txtFocoSesion;
//    }
//
//    public InputText getTxtHora() {
//        return txtHora;
//    }
//
//    public void setTxtHora(InputText txtHora) {
//        this.txtHora = txtHora;
//    }
//
//    public InputText getTxtIdHis() {
//        return txtIdHis;
//    }
//
//    public void setTxtIdHis(InputText txtIdHis) {
//        this.txtIdHis = txtIdHis;
//    }
//
//    public InputText getTxtIndicador() {
//        return txtIndicador;
//    }
//
//    public void setTxtIndicador(InputText txtIndicador) {
//        this.txtIndicador = txtIndicador;
//    }
//
//    public InputText getTxtProfundidad() {
//        return txtProfundidad;
//    }
//
//    public void setTxtProfundidad(InputText txtProfundidad) {
//        this.txtProfundidad = txtProfundidad;
//    }
//
//    public InputText getTxtIdEstado_Estado() {
//        return txtIdEstado_Estado;
//    }
//
//    public void setTxtIdEstado_Estado(InputText txtIdEstado_Estado) {
//        this.txtIdEstado_Estado = txtIdEstado_Estado;
//    }
//
//    public InputText getTxtIdProc_ProcCoaching() {
//        return txtIdProc_ProcCoaching;
//    }
//
//    public void setTxtIdProc_ProcCoaching(InputText txtIdProc_ProcCoaching) {
//        this.txtIdProc_ProcCoaching = txtIdProc_ProcCoaching;
//    }
//
//    public Calendar getTxtFecha() {
//        return txtFecha;
//    }
//
//    public void setTxtFecha(Calendar txtFecha) {
//        this.txtFecha = txtFecha;
//    }
//
//    public InputText getTxtIdSesi() {
//        return txtIdSesi;
//    }
//
//    public void setTxtIdSesi(InputText txtIdSesi) {
//        this.txtIdSesi = txtIdSesi;
//    }
//
//    public List<SesCoachingDTO> getData() {
//        try {
//            if (data == null) {
//                data = businessDelegatorView.getDataSesCoaching();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return data;
//    }
//
//    public void setData(List<SesCoachingDTO> sesCoachingDTO) {
//        this.data = sesCoachingDTO;
//    }
//
//    public SesCoachingDTO getSelectedSesCoaching() {
//        return selectedSesCoaching;
//    }
//
//    public void setSelectedSesCoaching(SesCoachingDTO sesCoaching) {
//        this.selectedSesCoaching = sesCoaching;
//    }
//
//    public CommandButton getBtnSave() {
//        return btnSave;
//    }
//
//    public void setBtnSave(CommandButton btnSave) {
//        this.btnSave = btnSave;
//    }
//
//    public CommandButton getBtnModify() {
//        return btnModify;
//    }
//
//    public void setBtnModify(CommandButton btnModify) {
//        this.btnModify = btnModify;
//    }
//
//    public CommandButton getBtnDelete() {
//        return btnDelete;
//    }
//
//    public void setBtnDelete(CommandButton btnDelete) {
//        this.btnDelete = btnDelete;
//    }
//
//    public CommandButton getBtnClear() {
//        return btnClear;
//    }
//
//    public void setBtnClear(CommandButton btnClear) {
//        this.btnClear = btnClear;
//    }
//
//    public TimeZone getTimeZone() {
//        return java.util.TimeZone.getDefault();
//    }
//
//    public IBusinessDelegate getBusinessDelegatorView() {
//        return businessDelegatorView;
//    }
//
//    public void setBusinessDelegatorView(
//        IBusinessDelegate businessDelegatorView) {
//        this.businessDelegatorView = businessDelegatorView;
//    }
//
//    public boolean isShowDialog() {
//        return showDialog;
//    }
//
//    public void setShowDialog(boolean showDialog) {
//        this.showDialog = showDialog;
//    }
}
