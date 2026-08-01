package defpackage;

import android.util.Size;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14912e implements Comparator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f29552e;

    public C14912e(boolean z) {
        this.f29552e = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f29552e ? signum * (-1) : signum;
    }
}
