/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.globalqss.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for LEC_SRI_Format
 *  @author iDempiere (generated) 
 *  @version Release 2.0
 */
@SuppressWarnings("all")
public interface I_LEC_SRI_Format 
{

    /** TableName=LEC_SRI_Format */
    public static final String Table_Name = "LEC_SRI_Format";

    /** AD_Table_ID=1000010 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Classname */
    public static final String COLUMNNAME_Classname = "Classname";

	/** Set Classname.
	  * Java Classname
	  */
	public void setClassname (String Classname);

	/** Get Classname.
	  * Java Classname
	  */
	public String getClassname();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LEC_SRI_Format_ID */
    public static final String COLUMNNAME_LEC_SRI_Format_ID = "LEC_SRI_Format_ID";

	/** Set LEC_SRI_Format	  */
	public void setLEC_SRI_Format_ID (int LEC_SRI_Format_ID);

	/** Get LEC_SRI_Format	  */
	public int getLEC_SRI_Format_ID();

    /** Column name LEC_SRI_Format_UU */
    public static final String COLUMNNAME_LEC_SRI_Format_UU = "LEC_SRI_Format_UU";

	/** Set LEC_SRI_Format_UU	  */
	public void setLEC_SRI_Format_UU (String LEC_SRI_Format_UU);

	/** Get LEC_SRI_Format_UU	  */
	public String getLEC_SRI_Format_UU();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name RecordsQty */
    public static final String COLUMNNAME_RecordsQty = "RecordsQty";

	/** Set Records Qty	  */
	public void setRecordsQty (BigDecimal RecordsQty);

	/** Get Records Qty	  */
	public BigDecimal getRecordsQty();

    /** Column name SRI_DeliveredType */
    public static final String COLUMNNAME_SRI_DeliveredType = "SRI_DeliveredType";

	/** Set SRI_DeliveredType	  */
	public void setSRI_DeliveredType (String SRI_DeliveredType);

	/** Get SRI_DeliveredType	  */
	public String getSRI_DeliveredType();

    /** Column name SRI_ShortDocType */
    public static final String COLUMNNAME_SRI_ShortDocType = "SRI_ShortDocType";

	/** Set SRI Short DocType	  */
	public void setSRI_ShortDocType (String SRI_ShortDocType);

	/** Get SRI Short DocType	  */
	public String getSRI_ShortDocType();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name URL_XSD */
    public static final String COLUMNNAME_URL_XSD = "URL_XSD";

	/** Set URL XSD	  */
	public void setURL_XSD (String URL_XSD);

	/** Get URL XSD	  */
	public String getURL_XSD();

    /** Column name ValidFrom */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";

	/** Set Valid from.
	  * Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom);

	/** Get Valid from.
	  * Valid from including this date (first day)
	  */
	public Timestamp getValidFrom();

    /** Column name ValidTo */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

	/** Set Valid to.
	  * Valid to including this date (last day)
	  */
	public void setValidTo (Timestamp ValidTo);

	/** Get Valid to.
	  * Valid to including this date (last day)
	  */
	public Timestamp getValidTo();

    /** Column name VersionNo */
    public static final String COLUMNNAME_VersionNo = "VersionNo";

	/** Set Version No.
	  * Version Number
	  */
	public void setVersionNo (String VersionNo);

	/** Get Version No.
	  * Version Number
	  */
	public String getVersionNo();

    /** Column name XMLPrintLabel */
    public static final String COLUMNNAME_XMLPrintLabel = "XMLPrintLabel";

	/** Set XML Print Label	  */
	public void setXMLPrintLabel (String XMLPrintLabel);

	/** Get XML Print Label	  */
	public String getXMLPrintLabel();
}
