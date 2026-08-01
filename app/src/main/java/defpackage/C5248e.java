package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۤٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5248e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ List f11317e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2163e f11318e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11319e;

    public /* synthetic */ C5248e(C2163e c2163e, List list, int i) {
        this.f11319e = i;
        this.f11318e = c2163e;
        this.f11317e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11319e) {
            case 0:
                this.f11318e.invoke(this.f11317e.get(((Number) obj).intValue()));
                return 1;
            default:
                this.f11318e.invoke(this.f11317e.get(((Number) obj).intValue()));
                return 1;
        }
    }
}
