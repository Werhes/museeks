package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9501e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Collection f18852e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18853e;

    public /* synthetic */ C9501e(int i, Collection collection) {
        this.f18853e = i;
        this.f18852e = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        switch (this.f18853e) {
            case 0:
                contains = this.f18852e.contains(obj);
                break;
            case 1:
                contains = this.f18852e.contains(obj);
                break;
            case 2:
                contains = this.f18852e.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f18852e);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
