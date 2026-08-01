package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1600e {
    public Boolean ad;
    public final Bundle appmetrica;
    public final int license;
    public final /* synthetic */ AbstractC6785e metrica;
    public final /* synthetic */ AbstractC6785e purchase;
    public boolean vip;

    public AbstractC1600e(AbstractC6785e abstractC6785e, int i, Bundle bundle) {
        this.purchase = abstractC6785e;
        Boolean bool = Boolean.TRUE;
        this.metrica = abstractC6785e;
        this.ad = bool;
        this.vip = false;
        this.license = i;
        this.appmetrica = bundle;
    }

    public abstract boolean ad();

    public final void license() {
        synchronized (this) {
            this.ad = null;
        }
    }

    public final void metrica() {
        license();
        AbstractC6785e abstractC6785e = this.metrica;
        synchronized (abstractC6785e.smaato) {
            abstractC6785e.smaato.remove(this);
        }
    }

    public abstract void vip(C14758e c14758e);
}
