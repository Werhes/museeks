package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3954e {
    public final AbstractC14073e ad;
    public long appmetrica;
    public EnumC7792e billing;
    public long license;
    public C2815e metrica;
    public long purchase;
    public C17985e vip;
    public float yandex;

    public AbstractC3954e(AbstractC14073e abstractC14073e) {
        this.ad = abstractC14073e;
        int i = C3618e.mopub;
        this.license = C3618e.adcel;
        this.appmetrica = 0L;
        this.purchase = 9205357640488583168L;
        this.billing = EnumC7792e.f15794e;
        this.yandex = 1.0f;
    }

    public abstract void ad(InterfaceC2235e interfaceC2235e, long j, long j2, C17985e c17985e);

    public abstract void metrica(InterfaceC2235e interfaceC2235e, long j, C17985e c17985e, float f, C2815e c2815e, AbstractC4457e abstractC4457e, int i);

    public final void vip(InterfaceC2235e interfaceC2235e, C2815e c2815e, long j, long j2, AbstractC4457e abstractC4457e, float f, int i) {
        AbstractC14073e abstractC14073e = this.ad;
        C2815e c2815e2 = null;
        if (abstractC14073e instanceof C10435e) {
            this.vip = ((C10435e) abstractC14073e).appmetrica;
            this.appmetrica = 0L;
        } else if (abstractC14073e instanceof C2904e) {
            C2904e c2904e = (C2904e) abstractC14073e;
            C2330e c2330e = c2904e.appmetrica;
            if (AbstractC13336e.yandex(c2330e)) {
                this.vip = null;
                this.appmetrica = c2330e.appmetrica;
            } else {
                this.vip = c2904e.purchase;
                this.appmetrica = 0L;
            }
        } else {
            if (!(abstractC14073e instanceof C14340e)) {
                throw new C14803e(10);
            }
            this.vip = null;
            this.appmetrica = 0L;
        }
        if (c2815e != null) {
            c2815e2 = c2815e;
        } else if (abstractC4457e == null && j2 != 16) {
            C2815e c2815e3 = this.metrica;
            if (c2815e3 == null || !C3618e.metrica(this.license, j2)) {
                c2815e3 = new C2815e(j2, 5);
                this.license = j2;
                this.metrica = c2815e3;
            }
            c2815e2 = c2815e3;
        }
        long j3 = this.purchase;
        if (j3 == 9205357640488583168L || !C2108e.vip(j3, j) || this.billing != interfaceC2235e.getLayoutDirection() || this.yandex != interfaceC2235e.vip()) {
            ad(interfaceC2235e, j, this.appmetrica, this.vip);
            this.purchase = j;
            this.billing = interfaceC2235e.getLayoutDirection();
            this.yandex = interfaceC2235e.vip();
        }
        metrica(interfaceC2235e, this.appmetrica, this.vip, f, c2815e2, abstractC4457e, i);
    }
}
