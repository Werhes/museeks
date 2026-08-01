package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9389e extends AbstractC10596e {
    public final C1962e purchase;

    public C9389e(AbstractC6690e abstractC6690e, C1962e c1962e) {
        super(abstractC6690e);
        this.purchase = c1962e;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        super.smaato(i, c11501e, j);
        C1962e c1962e = this.purchase;
        c11501e.metrica = c1962e;
        C16914e c16914e = c1962e.vip;
        c11501e.vip = c16914e != null ? c16914e.yandex : null;
        return c11501e;
    }
}
