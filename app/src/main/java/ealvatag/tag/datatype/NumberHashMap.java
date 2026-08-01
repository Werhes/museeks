package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1376e;
import defpackage.C0215e;
import defpackage.C12551e;
import defpackage.C15816e;
import defpackage.C16089e;
import defpackage.C1724e;
import defpackage.C2362e;
import defpackage.C6594e;
import defpackage.C7936e;
import defpackage.C7988e;
import defpackage.C9770e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC2062e;
import defpackage.InterfaceC4279e;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class NumberHashMap extends NumberFixedLength {
    private boolean hasEmptyValue;
    private final InterfaceC2062e simpleIntStringMap;

    public NumberHashMap(NumberHashMap numberHashMap) {
        super(numberHashMap);
        this.hasEmptyValue = false;
        this.hasEmptyValue = numberHashMap.hasEmptyValue;
        this.simpleIntStringMap = numberHashMap.simpleIntStringMap;
    }

    public NumberHashMap(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e, i);
        this.hasEmptyValue = false;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1181694867:
                if (str.equals(DataTypes.OBJ_TIME_STAMP_FORMAT)) {
                    c = 0;
                    break;
                }
                break;
            case -389131437:
                if (str.equals(DataTypes.OBJ_CONTENT_TYPE)) {
                    c = 1;
                    break;
                }
                break;
            case 395270456:
                if (str.equals(DataTypes.OBJ_PICTURE_TYPE)) {
                    c = 2;
                    break;
                }
                break;
            case 521623794:
                if (str.equals(DataTypes.OBJ_TYPE_OF_CHANNEL)) {
                    c = 3;
                    break;
                }
                break;
            case 816217673:
                if (str.equals(DataTypes.OBJ_TYPE_OF_EVENT)) {
                    c = 4;
                    break;
                }
                break;
            case 1343251611:
                if (str.equals(DataTypes.OBJ_RECIEVED_AS)) {
                    c = 5;
                    break;
                }
                break;
            case 1607314880:
                if (str.equals(DataTypes.OBJ_TEXT_ENCODING)) {
                    c = 6;
                    break;
                }
                break;
            case 1627681669:
                if (str.equals(DataTypes.OBJ_INTERPOLATION_METHOD)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.simpleIntStringMap = C0215e.ad();
                return;
            case 1:
                this.simpleIntStringMap = C7988e.m2361this();
                return;
            case 2:
                this.simpleIntStringMap = C2362e.m809const();
                this.hasEmptyValue = true;
                return;
            case 3:
                this.simpleIntStringMap = C6594e.m2214new();
                return;
            case 4:
                this.simpleIntStringMap = C12551e.ad();
                return;
            case 5:
                this.simpleIntStringMap = C9770e.signatures();
                return;
            case 6:
                this.simpleIntStringMap = C16089e.premium();
                return;
            case 7:
                if (C15816e.f31188e == null) {
                    synchronized (C15816e.class) {
                        try {
                            if (C15816e.f31188e == null) {
                                C15816e.f31188e = new C15816e(0);
                            }
                        } finally {
                        }
                    }
                }
                this.simpleIntStringMap = C15816e.f31188e;
                return;
            default:
                throw new IllegalArgumentException("Hashmap identifier not defined in this class: ".concat(str));
        }
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NumberHashMap)) {
            return false;
        }
        NumberHashMap numberHashMap = (NumberHashMap) obj;
        return this.hasEmptyValue == numberHashMap.hasEmptyValue && AbstractC1376e.vip(this.simpleIntStringMap, numberHashMap.simpleIntStringMap) && super.equals(numberHashMap);
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        super.readByteArray(bArr, i);
        int intValue = ((Number) this.value).intValue();
        if (this.simpleIntStringMap.mo269instanceof(intValue)) {
            return;
        }
        if (this.hasEmptyValue) {
            if (this.identifier.equals(DataTypes.OBJ_PICTURE_TYPE)) {
                InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e).getClass();
                int i2 = C1724e.ad;
                return;
            }
            return;
        }
        String str = this.identifier;
        Locale.getDefault();
        throw new Exception(str + ":No key could be found with the value of:" + intValue);
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength, ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj instanceof Byte) {
            this.value = Long.valueOf(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            this.value = Long.valueOf(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            this.value = Long.valueOf(((Integer) obj).intValue());
        } else {
            this.value = obj;
        }
    }

    @Override // ealvatag.tag.datatype.NumberFixedLength
    public String toString() {
        Object obj = this.value;
        return obj == null ? BuildConfig.FLAVOR : this.simpleIntStringMap.getValue(((Number) obj).intValue());
    }
}
