package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7919e implements InterfaceC11305e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f16034e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f16035e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f16036e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16037e;

    public /* synthetic */ AbstractC7919e(int i, Object obj, Object obj2, Object obj3) {
        this.f16037e = i;
        this.f16035e = obj;
        this.f16034e = obj2;
        this.f16036e = obj3;
    }

    public AbstractC7919e(Object obj) {
        this.f16037e = 0;
        this.f16035e = obj;
        this.f16036e = new ArrayList();
        this.f16034e = obj;
    }

    public void ad() {
        ((ArrayList) this.f16036e).clear();
        this.f16034e = this.f16035e;
        purchase();
    }

    @Override // defpackage.InterfaceC11305e
    public void advert() {
        this.f16034e = AbstractC5851e.purchase((ArrayList) this.f16036e);
    }

    @Override // defpackage.InterfaceC11305e
    public void appmetrica(Object obj) {
        ((ArrayList) this.f16036e).add(this.f16034e);
        this.f16034e = obj;
    }

    @Override // defpackage.InterfaceC11305e
    public void billing() {
        Object metrica = metrica();
        InterfaceC16503e interfaceC16503e = metrica instanceof InterfaceC16503e ? (InterfaceC16503e) metrica : null;
        if (interfaceC16503e != null) {
            interfaceC16503e.startapp();
        }
    }

    @Override // defpackage.InterfaceC11305e
    public /* synthetic */ void loadAd() {
    }

    public Object metrica() {
        return this.f16034e;
    }

    public abstract void purchase();

    @Override // defpackage.InterfaceC11305e
    public void smaato(Object obj, Function2 function2) {
        function2.invoke(metrica(), obj);
    }

    public String toString() {
        switch (this.f16037e) {
            case 2:
                return getClass().getSimpleName() + ": " + vip();
            default:
                return super.toString();
        }
    }

    public abstract C12816e vip();
}
