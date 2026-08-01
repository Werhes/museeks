package defpackage;

import ealvatag.tag.datatype.AbstractDataType;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12444e extends AbstractC11463e {
    private ArrayList<AbstractDataType> dataTypeList = new ArrayList<>(10);
    private HashMap<String, AbstractDataType> dataTypeMap = new HashMap<>(5);
    private AbstractC14583e header;

    public AbstractC12444e() {
        setupObjectList();
    }

    public AbstractC12444e(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        Object newInstance;
        ArrayList<AbstractDataType> arrayList = abstractID3v2FrameBody.dataTypeList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractDataType abstractDataType = arrayList.get(i);
            if (abstractDataType == null) {
                newInstance = null;
            } else {
                try {
                    newInstance = abstractDataType.getClass().getConstructor(abstractDataType.getClass()).newInstance(abstractDataType);
                } catch (IllegalAccessException unused) {
                    throw new IllegalArgumentException("IllegalAccessException: No access to run constructor to create copy".concat(abstractDataType.getClass().getName()));
                } catch (InstantiationException unused2) {
                    throw new IllegalArgumentException("InstantiationException: Unable to instantiate constructor to copy".concat(abstractDataType.getClass().getName()));
                } catch (NoSuchMethodException unused3) {
                    throw new IllegalArgumentException("NoSuchMethodException: Error finding constructor to create copy:".concat(abstractDataType.getClass().getName()));
                } catch (InvocationTargetException e) {
                    if (e.getCause() instanceof Error) {
                        throw ((Error) e.getCause());
                    }
                    if (!(e.getCause() instanceof RuntimeException)) {
                        throw new IllegalArgumentException("InvocationTargetException: Unable to invoke constructor to create copy");
                    }
                    throw ((RuntimeException) e.getCause());
                }
            }
            AbstractDataType abstractDataType2 = (AbstractDataType) newInstance;
            abstractDataType2.setBody(this);
            addDataType(abstractDataType2);
        }
    }

    public void addDataType(AbstractDataType abstractDataType) {
        this.dataTypeList.add(abstractDataType);
        this.dataTypeMap.put(abstractDataType.getIdentifier(), abstractDataType);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC12444e) {
            return this.dataTypeList.equals(((AbstractC12444e) obj).dataTypeList);
        }
        return false;
    }

    public String getBriefDescription() {
        int size = this.dataTypeList.size();
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        for (int i = 0; i < size; i++) {
            AbstractDataType abstractDataType = this.dataTypeList.get(i);
            if (abstractDataType.toString() != null && abstractDataType.toString().length() > 0) {
                sb.append(abstractDataType.getIdentifier());
                sb.append("=\"");
                sb.append(abstractDataType.toString());
                sb.append("\"; ");
            }
        }
        return sb.toString();
    }

    public List<AbstractDataType> getDataTypeList() {
        return this.dataTypeList;
    }

    public AbstractC14583e getHeader() {
        return this.header;
    }

    public final String getLongDescription() {
        Iterator<AbstractDataType> it = this.dataTypeList.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            AbstractDataType next = it.next();
            if (next.toString() != null && next.toString().length() > 0) {
                StringBuilder inmobi = AbstractC8703e.inmobi(str);
                inmobi.append(next.getIdentifier());
                inmobi.append(" = ");
                inmobi.append(next.toString());
                inmobi.append("\n");
                str = inmobi.toString();
            }
        }
        return str;
    }

    public final AbstractDataType getObject(String str) {
        return this.dataTypeMap.get(str);
    }

    public final Object getObjectValue(String str) {
        return getObject(str).getValue();
    }

    public final byte getTextEncoding() {
        AbstractDataType object = getObject(DataTypes.OBJ_TEXT_ENCODING);
        if (object != null) {
            return ((Long) object.getValue()).byteValue();
        }
        return (byte) 0;
    }

    public String getUserFriendlyValue() {
        return toString();
    }

    public boolean isSubsetOf(Object obj) {
        if (!(obj instanceof AbstractC12444e)) {
            return false;
        }
        AbstractC12444e abstractC12444e = (AbstractC12444e) obj;
        int size = this.dataTypeList.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC12444e.dataTypeMap.containsKey(this.dataTypeList.get(i).getIdentifier())) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return this.dataTypeList.iterator();
    }

    public void setHeader(AbstractC14583e abstractC14583e) {
        this.header = abstractC14583e;
    }

    public final void setObjectValue(String str, Object obj) {
        AbstractDataType abstractDataType = this.dataTypeMap.get(str);
        if (abstractDataType != null) {
            abstractDataType.setValue(obj);
        }
    }

    public final void setTextEncoding(byte b) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
    }

    public abstract void setupObjectList();

    public String toString() {
        return getBriefDescription();
    }
}
