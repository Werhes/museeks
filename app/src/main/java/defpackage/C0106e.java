package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106e extends AbstractC1776e {
    public final C0583e appmetrica;
    public final C12618e license;
    public final C2007e purchase;
    public final C0583e vip = AbstractC16565e.license();
    public final ArrayList metrica = new ArrayList();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object] */
    public C0106e() {
        C12618e c12618e = AbstractC1710e.ad;
        this.license = new C12618e();
        this.appmetrica = new C0583e();
        C17689e c17689e = new C17689e(10, this);
        AbstractC12909e.appmetrica(AbstractC12909e.ad);
        synchronized (AbstractC12909e.metrica) {
            AbstractC12909e.yandex = AbstractC13480e.m3572catch(c17689e, AbstractC12909e.yandex);
            Unit unit = Unit.INSTANCE;
        }
        this.purchase = new C2007e(10, c17689e);
    }

    @Override // defpackage.AbstractC1776e
    public final void ad(InterfaceC15080e interfaceC15080e) {
        this.metrica.add(new C18260e(interfaceC15080e));
    }

    @Override // defpackage.AbstractC1776e
    public final Function1 license(InterfaceC15080e interfaceC15080e) {
        C0583e c0583e = this.appmetrica;
        Function1 function1 = (Function1) c0583e.billing(interfaceC15080e);
        if (function1 != null) {
            return function1;
        }
        C10869e c10869e = new C10869e(this, interfaceC15080e, 8);
        c0583e.mopub(interfaceC15080e, c10869e);
        return c10869e;
    }

    @Override // defpackage.AbstractC1776e
    public final void metrica() {
        this.purchase.vip();
        this.metrica.clear();
        this.appmetrica.ad();
        synchronized (this.ad) {
            this.vip.ad();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC1776e
    public final void vip() {
        synchronized (this.ad) {
            try {
                ArrayList arrayList = this.metrica;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC3302e interfaceC3302e = (InterfaceC3302e) arrayList.get(i);
                    if (interfaceC3302e instanceof C1491e) {
                        AbstractC16565e.metrica(this.vip, ((C1491e) interfaceC3302e).ad, ((C1491e) interfaceC3302e).vip);
                    } else {
                        if (!(interfaceC3302e instanceof C18260e)) {
                            throw new C14803e(10);
                        }
                        AbstractC16565e.purchase(this.vip, ((C18260e) interfaceC3302e).ad);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.metrica.clear();
    }
}
