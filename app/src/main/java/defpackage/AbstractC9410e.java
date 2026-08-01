package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9410e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C13882e f18727e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final HandlerC17797e f18728e = new HandlerC17797e(8, this);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2362e f18729e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f18730e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13935e f18731e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f18732e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13486e f18733e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f18734e;

    public AbstractC9410e(Context context, C2362e c2362e) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f18732e = context;
        if (c2362e != null) {
            this.f18729e = c2362e;
        } else {
            this.f18729e = new C2362e(19, new ComponentName(context, getClass()));
        }
    }

    public AbstractC16709e ad(String str, C17039e c17039e) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract void appmetrica(C13882e c13882e);

    public final void billing(C13882e c13882e) {
        C10085e.vip();
        if (Objects.equals(this.f18727e, c13882e)) {
            return;
        }
        this.f18727e = c13882e;
        if (this.f18734e) {
            return;
        }
        this.f18734e = true;
        this.f18728e.sendEmptyMessage(2);
    }

    public AbstractC13922e license(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return metrica(str, C17039e.vip);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public AbstractC13922e metrica(String str, C17039e c17039e) {
        return vip(str);
    }

    public final void purchase(C13486e c13486e) {
        C10085e.vip();
        if (this.f18733e != c13486e) {
            this.f18733e = c13486e;
            if (this.f18730e) {
                return;
            }
            this.f18730e = true;
            this.f18728e.sendEmptyMessage(1);
        }
    }

    public AbstractC13922e vip(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}
