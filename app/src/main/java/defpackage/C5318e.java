package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۨ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5318e extends AbstractC1776e {
    public C12618e appmetrica;
    public final C13749e billing = new C13749e(27, this);
    public C12618e license;
    public Object metrica;
    public InterfaceC15080e purchase;
    public Object vip;
    public final C2007e yandex;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public C5318e() {
        C3450e c3450e = new C3450e(7, this);
        AbstractC12909e.appmetrica(AbstractC12909e.ad);
        synchronized (AbstractC12909e.metrica) {
            AbstractC12909e.yandex = AbstractC13480e.m3572catch(c3450e, AbstractC12909e.yandex);
            Unit unit = Unit.INSTANCE;
        }
        this.yandex = new C2007e(10, c3450e);
    }

    @Override // defpackage.AbstractC1776e
    public final void ad(InterfaceC15080e interfaceC15080e) {
        this.metrica = null;
        this.appmetrica = null;
    }

    @Override // defpackage.AbstractC1776e
    public final Function1 license(InterfaceC15080e interfaceC15080e) {
        InterfaceC15080e interfaceC15080e2 = this.purchase;
        if (interfaceC15080e2 != null && !interfaceC15080e2.equals(interfaceC15080e)) {
            AbstractC6536e.vip("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.purchase = interfaceC15080e;
        return this.billing;
    }

    @Override // defpackage.AbstractC1776e
    public final void metrica() {
        this.yandex.vip();
        this.metrica = null;
        this.appmetrica = null;
        synchronized (this.ad) {
            this.purchase = null;
            this.vip = null;
            this.license = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC1776e
    public final void vip() {
        synchronized (this.ad) {
            try {
                this.vip = this.metrica;
                if (this.appmetrica == null) {
                    this.license = null;
                } else {
                    if (this.license == null) {
                        C12618e c12618e = AbstractC1710e.ad;
                        this.license = new C12618e();
                    }
                    C12618e c12618e2 = this.license;
                    this.license = this.appmetrica;
                    this.appmetrica = c12618e2;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
