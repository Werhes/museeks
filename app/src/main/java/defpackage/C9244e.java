package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;

/* renamed from: eٍؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9244e implements Serializable, Cloneable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18451e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f18452e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18453e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C11557e f18454e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f18450e = false;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f18455e = false;

    public C9244e(int i) {
        this.f18452e = i;
    }

    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final C9244e clone() {
        C9244e c9244e = new C9244e(this.f18452e);
        c9244e.f18454e = this.f18454e;
        c9244e.f18451e = this.f18451e;
        c9244e.f18453e = this.f18453e;
        c9244e.f18450e = this.f18450e;
        c9244e.f18455e = this.f18455e;
        return c9244e;
    }

    public final int vip() {
        return (!this.f18450e || this.f18455e) ? Alert.DURATION_SHOW_INDEFINITELY : this.f18451e;
    }
}
