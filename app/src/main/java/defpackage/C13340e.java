package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13340e implements InterfaceC10645e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18287e f26584e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ ServiceC13230e f26585e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f26586e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f26583e = new ArrayList();

    public C13340e(ServiceC13230e serviceC13230e, C18287e c18287e) {
        this.f26585e = serviceC13230e;
        this.f26584e = c18287e;
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void adcel(int i, C9759e c9759e) {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void advert(int i, int i2, int i3) {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void amazon(int i, C12693e c12693e, boolean z, boolean z2, int i2) {
    }

    @Override // defpackage.InterfaceC10645e
    public final void appmetrica(int i, C11753e c11753e, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f26586e) {
            try {
                for (int size = this.f26583e.size() - 1; size >= 0; size--) {
                    C3970e c3970e = (C3970e) this.f26583e.get(size);
                    if (Objects.equals(this.f26584e, c3970e.vip) && c3970e.metrica.equals(str)) {
                        arrayList.add(c3970e);
                        this.f26583e.remove(size);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AbstractC9413e.m2565strictfp(this.f26585e.f26249e.advert, new RunnableC7410e(this, arrayList, 10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void billing(int i, C8802e c8802e) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13340e) {
            return Objects.equals(this.f26584e, ((C13340e) obj).f26584e);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26584e);
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void metrica(int i) {
    }

    @Override // defpackage.InterfaceC10645e
    public final void mopub(int i, C11753e c11753e, String str) {
        Bundle bundle = c11753e != null ? c11753e.ad : null;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        C18287e c18287e = this.f26584e;
        if (c18287e == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle2 == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        C11467e c11467e = this.f26585e.f26257e;
        c11467e.getClass();
        ((ServiceC13230e) c11467e.f23071e).f26258e.post(new RunnableC11327e(c11467e, c18287e, str, bundle2, 1));
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void purchase(int i, List list) {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void smaato(int i, C2411e c2411e, C5298e c5298e, boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void startapp(int i, C5298e c5298e) {
    }

    @Override // defpackage.InterfaceC10645e
    public final /* synthetic */ void vip(int i, C11858e c11858e) {
    }
}
