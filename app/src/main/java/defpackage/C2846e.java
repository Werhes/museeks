package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2846e {
    public C17489e ad;
    public int appmetrica;
    public C0583e billing;
    public Function2 license;
    public C3155e metrica;
    public C17866e purchase;
    public int vip;

    public C2846e(C17489e c17489e) {
        this.ad = c17489e;
    }

    public final boolean ad() {
        if (this.ad != null) {
            C3155e c3155e = this.metrica;
            if (c3155e != null ? c3155e.ad() : false) {
                return true;
            }
        }
        return false;
    }

    public final void appmetrica(boolean z) {
        int i = this.vip;
        this.vip = z ? i | 32 : i & (-33);
    }

    public final void license() {
        C17489e c17489e = this.ad;
        if (c17489e != null) {
            c17489e.f34294e = true;
            c17489e.f34307e.purchase();
        }
        this.ad = null;
        this.purchase = null;
        this.billing = null;
        this.license = null;
    }

    public final int metrica(Object obj) {
        int remoteconfig;
        C17489e c17489e = this.ad;
        if (c17489e == null || (remoteconfig = c17489e.remoteconfig(this, obj)) == 0) {
            return 1;
        }
        return remoteconfig;
    }

    public final void purchase() {
        this.vip |= 1;
    }

    public final void vip() {
        C17489e c17489e = this.ad;
        if (c17489e != null) {
            c17489e.remoteconfig(this, null);
        }
    }
}
