package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.AbstractDataType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractDataTypeList<T extends AbstractDataType> extends AbstractDataType {
    public AbstractDataTypeList(AbstractDataTypeList<T> abstractDataTypeList) {
        super(abstractDataTypeList);
    }

    public AbstractDataTypeList(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        setValue((List) new ArrayList());
    }

    public abstract T createListElement();

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Iterator<T> it = getValue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getSize();
        }
        return i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public List<T> getValue() {
        return (List) super.getValue();
    }

    public int hashCode() {
        if (getValue() != null) {
            return getValue().hashCode();
        }
        return 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        int i2 = (int) c16151e.f31731e;
        if (i2 == 0) {
            getValue().clear();
            return;
        }
        int min = Math.min(i, i2);
        for (int i3 = 0; i3 < min; i3++) {
            T createListElement = createListElement();
            createListElement.read(c16151e, i);
            createListElement.setBody(this.frameBody);
            getValue().add(createListElement);
            min -= createListElement.getSize();
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0) {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i >= bArr.length) {
            getValue().clear();
            return;
        }
        while (i < bArr.length) {
            T createListElement = createListElement();
            createListElement.readByteArray(bArr, i);
            createListElement.setBody(this.frameBody);
            getValue().add(createListElement);
            i += createListElement.getSize();
        }
    }

    public void setValue(List<T> list) {
        super.setValue((Object) (list == null ? new ArrayList() : new ArrayList(list)));
    }

    public String toString() {
        return getValue() != null ? getValue().toString() : "%s";
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        getIdentifier();
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[getSize()];
        Iterator<T> it = getValue().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] writeByteArray = it.next().writeByteArray();
            System.arraycopy(writeByteArray, 0, bArr, i2, writeByteArray.length);
            i2 += writeByteArray.length;
        }
        return bArr;
    }
}
