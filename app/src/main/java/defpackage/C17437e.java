package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17437e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7855e f34152e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34153e;

    public /* synthetic */ C17437e(C7855e c7855e, int i) {
        this.f34153e = i;
        this.f34152e = c7855e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34153e) {
            case 0:
                return ((C16523e) this.f34152e.f15902e.get(((Integer) obj).intValue())).metrica;
            case 1:
                return ((C16523e) this.f34152e.f15902e.get(((Integer) obj).intValue())).metrica;
            default:
                C7855e c7855e = this.f34152e;
                ArrayList arrayList = c7855e.f15902e;
                ((C17213e) obj).mopub(arrayList.size(), null, new C7976e(arrayList, 23, false), new C2892e(2039820996, true, new C15055e(arrayList, c7855e, 5)));
                return Unit.INSTANCE;
        }
    }
}
