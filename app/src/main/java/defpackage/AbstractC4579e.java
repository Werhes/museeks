package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4579e extends AbstractC15168e {
    public final C3907e vip;

    public AbstractC4579e(InterfaceC5372e interfaceC5372e) {
        super(interfaceC5372e);
        this.vip = new C3907e(interfaceC5372e.appmetrica());
    }

    public abstract void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i);

    @Override // defpackage.AbstractC15168e, defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        int startapp = startapp(obj);
        C3907e c3907e = this.vip;
        InterfaceC11845e pro = interfaceC5757e.pro(c3907e, startapp);
        Signature(pro, obj, startapp);
        pro.vip(c3907e);
    }

    @Override // defpackage.AbstractC15168e
    public final void amazon(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return this.vip;
    }

    @Override // defpackage.AbstractC16956e
    public final int billing(Object obj) {
        return ((AbstractC9519e) obj).license();
    }

    public abstract Object loadAd();

    @Override // defpackage.AbstractC16956e, defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        return adcel(interfaceC11754e);
    }

    @Override // defpackage.AbstractC16956e
    public final Object purchase() {
        return (AbstractC9519e) advert(loadAd());
    }

    @Override // defpackage.AbstractC16956e
    public final Object smaato(Object obj) {
        return ((AbstractC9519e) obj).ad();
    }

    @Override // defpackage.AbstractC16956e
    public final Iterator yandex(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }
}
