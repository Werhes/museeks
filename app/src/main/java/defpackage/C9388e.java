package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9388e implements Comparator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f18647e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C10659e f18649e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Rect f18650e = new Rect();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Rect f18648e = new Rect();

    public C9388e(boolean z, C10659e c10659e) {
        this.f18647e = z;
        this.f18649e = c10659e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C10659e c10659e = this.f18649e;
        c10659e.getClass();
        Rect rect = this.f18650e;
        ((C8092e) obj).purchase(rect);
        c10659e.getClass();
        Rect rect2 = this.f18648e;
        ((C8092e) obj2).purchase(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f18647e;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
