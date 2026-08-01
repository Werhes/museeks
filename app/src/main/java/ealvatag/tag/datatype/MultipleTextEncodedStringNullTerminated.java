package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.C10754e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class MultipleTextEncodedStringNullTerminated extends AbstractDataType {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    /* loaded from: classes3.dex */
    public static class Values {
        private List<String> valueList = new ArrayList();

        public void add(String str) {
            this.valueList.add(str);
        }

        public List<String> getList() {
            return this.valueList;
        }

        public int getNumberOfValues() {
            return this.valueList.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListIterator<String> listIterator = this.valueList.listIterator();
            while (listIterator.hasNext()) {
                sb.append(listIterator.next());
                if (listIterator.hasNext()) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    public MultipleTextEncodedStringNullTerminated(MultipleTextEncodedStringNullTerminated multipleTextEncodedStringNullTerminated) {
        super(multipleTextEncodedStringNullTerminated);
    }

    public MultipleTextEncodedStringNullTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
        this.value = new Values();
    }

    public MultipleTextEncodedStringNullTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.value = new Values();
    }

    public boolean canBeEncoded() {
        Object obj = this.value;
        if (obj == null) {
            return false;
        }
        List<String> list = ((Values) obj).getList();
        if (list.isEmpty()) {
            return false;
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!new TextEncodedStringNullTerminated(this.identifier, this.frameBody, listIterator.next()).canBeEncoded()) {
                return false;
            }
        }
        return true;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof MultipleTextEncodedStringNullTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        int size = getSize();
        while (size > 0) {
            TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
            if (textEncodedStringNullTerminated.getSize() == 0) {
                return;
            }
            Object obj = this.value;
            if (obj != null) {
                ((Values) obj).add((String) textEncodedStringNullTerminated.getValue());
                size -= textEncodedStringNullTerminated.getSize();
            } else {
                InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e).getClass();
                int i2 = C1724e.ad;
            }
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        TextEncodedStringNullTerminated textEncodedStringNullTerminated;
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        do {
            try {
                textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody);
                textEncodedStringNullTerminated.readByteArray(bArr, i);
            } catch (C10754e unused) {
            }
            if (textEncodedStringNullTerminated.getSize() == 0) {
                InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e2).getClass();
                int i3 = C1724e.ad;
                return;
            }
            Object obj = this.value;
            if (obj != null) {
                ((Values) obj).add((String) textEncodedStringNullTerminated.getValue());
                this.size += textEncodedStringNullTerminated.getSize();
                i += textEncodedStringNullTerminated.getSize();
            } else {
                InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e3).getClass();
                int i4 = C1724e.ad;
            }
        } while (this.size != 0);
        InterfaceC4279e interfaceC4279e4 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e4).getClass();
        int i5 = C1724e.ad;
        throw new Exception("No null terminated Strings found");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Object obj = this.value;
            if (obj == null) {
                InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e2).getClass();
                return EMPTY_BYTE_ARRAY;
            }
            ListIterator<String> listIterator = ((Values) obj).getList().listIterator();
            int i2 = 0;
            while (listIterator.hasNext()) {
                TextEncodedStringNullTerminated textEncodedStringNullTerminated = new TextEncodedStringNullTerminated(this.identifier, this.frameBody, listIterator.next());
                byteArrayOutputStream.write(textEncodedStringNullTerminated.writeByteArray());
                i2 += textEncodedStringNullTerminated.getSize();
            }
            this.size = i2;
            InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e3).getClass();
            int i3 = C1724e.ad;
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            InterfaceC4279e interfaceC4279e4 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e4).getClass();
            int i4 = C1724e.ad;
            throw new RuntimeException(e);
        }
    }
}
