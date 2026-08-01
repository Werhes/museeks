package defpackage;

/* renamed from: eِؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11540e {
    public final int ad;
    public int license;
    public int metrica;
    public long vip;

    public AbstractC11540e(int i) {
        this.metrica = 0;
        this.vip = 0L;
        this.license = 0;
        this.ad = i;
    }

    public AbstractC11540e(AbstractC11540e abstractC11540e) {
        this.ad = abstractC11540e.metrica;
        this.vip = abstractC11540e.vip;
        this.metrica = abstractC11540e.ad;
        this.license = abstractC11540e.license;
    }

    public byte[] ad() {
        byte[] bArr = new byte[32];
        AbstractC3628e.billing(this.ad, 0, bArr);
        AbstractC3628e.admob(4, this.vip, bArr);
        AbstractC3628e.billing(this.metrica, 12, bArr);
        AbstractC3628e.billing(this.license, 28, bArr);
        return bArr;
    }
}
