package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12526e extends AbstractC16824e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8850e f25078e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function1 f25079e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC16824e f25080e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC18107e f25081e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14554e f25082e;

    public C12526e(C14554e c14554e, AbstractC16824e abstractC16824e, Function1 function1, InterfaceC18107e interfaceC18107e) {
        this.f25082e = c14554e;
        this.f25080e = abstractC16824e;
        this.f25079e = function1;
        this.f25081e = interfaceC18107e;
        this.f25078e = abstractC16824e.advert();
    }

    @Override // defpackage.InterfaceC3052e
    public final InterfaceC18107e ad() {
        return this.f25081e;
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f25078e;
    }

    @Override // defpackage.AbstractC16824e
    public final C17476e appmetrica() {
        return this.f25080e.appmetrica();
    }

    @Override // defpackage.AbstractC16824e
    public final C2394e billing() {
        return this.f25080e.billing();
    }

    @Override // defpackage.AbstractC16824e
    public final InterfaceC13033e metrica() {
        return (InterfaceC13033e) this.f25079e.invoke(this.f25080e);
    }

    @Override // defpackage.AbstractC16824e
    public final C17476e purchase() {
        return this.f25080e.purchase();
    }

    @Override // defpackage.AbstractC16824e
    public final C5042e vip() {
        return this.f25082e;
    }

    @Override // defpackage.AbstractC16824e
    public final C4983e yandex() {
        return this.f25080e.yandex();
    }
}
