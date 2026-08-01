package defpackage;

import java.lang.reflect.Method;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13834e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C13834e f27395e = new C13834e(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27396e;

    public /* synthetic */ C13834e(int i) {
        this.f27396e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27396e) {
            case 0:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            default:
                return AbstractC0258e.vip(((Method) obj).getName(), ((Method) obj2).getName());
        }
    }
}
