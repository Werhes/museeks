package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.C12551e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class SynchronisedTempoCode extends AbstractDataType implements Cloneable {
    private TempoCode tempo;
    private NumberFixedLength timestamp;

    private SynchronisedTempoCode(SynchronisedTempoCode synchronisedTempoCode) {
        super(synchronisedTempoCode);
        this.tempo = new TempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO_DATA, null, 1);
        this.timestamp = new NumberFixedLength(DataTypes.OBJ_DATETIME, null, 4);
        this.tempo.setValue(synchronisedTempoCode.tempo.getValue());
        this.timestamp.setValue(synchronisedTempoCode.timestamp.getValue());
    }

    public SynchronisedTempoCode(String str, AbstractC12444e abstractC12444e) {
        this(str, abstractC12444e, 0, 0L);
    }

    public SynchronisedTempoCode(String str, AbstractC12444e abstractC12444e, int i, long j) {
        super(str, abstractC12444e);
        this.tempo = new TempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO_DATA, null, 1);
        this.timestamp = new NumberFixedLength(DataTypes.OBJ_DATETIME, null, 4);
        setBody(abstractC12444e);
        this.tempo.setValue(Integer.valueOf(i));
        this.timestamp.setValue(Long.valueOf(j));
    }

    public Object clone() {
        return new SynchronisedTempoCode(this);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SynchronisedTempoCode synchronisedTempoCode = (SynchronisedTempoCode) obj;
        return getTempo() == synchronisedTempoCode.getTempo() && getTimestamp() == synchronisedTempoCode.getTimestamp();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.timestamp.getSize() + this.tempo.getSize();
    }

    public int getTempo() {
        return ((Number) this.tempo.getValue()).intValue();
    }

    public long getTimestamp() {
        return ((Number) this.timestamp.getValue()).longValue();
    }

    public int hashCode() {
        TempoCode tempoCode = this.tempo;
        int hashCode = (tempoCode != null ? tempoCode.hashCode() : 0) * 31;
        NumberFixedLength numberFixedLength = this.timestamp;
        return hashCode + (numberFixedLength != null ? numberFixedLength.hashCode() : 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        this.tempo.read(c16151e, i);
        this.timestamp.read(c16151e, i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        int size = getSize();
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        if (i <= bArr.length - size) {
            this.tempo.readByteArray(bArr, i);
            this.timestamp.readByteArray(bArr, this.tempo.getSize() + i);
        } else {
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
            throw new Exception("Invalid size for FrameBody");
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setBody(AbstractC12444e abstractC12444e) {
        super.setBody(abstractC12444e);
        this.tempo.setBody(abstractC12444e);
        this.timestamp.setBody(abstractC12444e);
    }

    public void setTempo(int i) {
        if (i < 0 || i > 510) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Tempo must be a positive value less than 511: "));
        }
        this.tempo.setValue(Integer.valueOf(i));
    }

    public void setTimestamp(long j) {
        this.timestamp.setValue(Long.valueOf(j));
    }

    public String toString() {
        return BuildConfig.FLAVOR + getTempo() + " (\"" + C12551e.ad().getValue(getTempo()) + "\"), " + getTimestamp();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] writeByteArray = this.tempo.writeByteArray();
        byte[] writeByteArray2 = this.timestamp.writeByteArray();
        if (writeByteArray == null || writeByteArray2 == null) {
            return null;
        }
        byte[] bArr = new byte[writeByteArray.length + writeByteArray2.length];
        System.arraycopy(writeByteArray, 0, bArr, 0, writeByteArray.length);
        System.arraycopy(writeByteArray2, 0, bArr, writeByteArray.length, writeByteArray2.length);
        return bArr;
    }
}
