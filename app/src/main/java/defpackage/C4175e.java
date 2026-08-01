package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4175e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f9209e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9210e;

    public /* synthetic */ C4175e(int i, ArrayList arrayList) {
        this.f9210e = i;
        this.f9209e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9210e) {
            case 0:
                return ((InterfaceC13984e) this.f9209e.get(0)).isVip();
            default:
                ArrayList arrayList = this.f9209e;
                if (arrayList.isEmpty()) {
                    return C13664e.f27089e;
                }
                return arrayList.subList((((CharSequence) AbstractC13480e.m3591interface(arrayList)).length() != 0 || arrayList.size() <= 1) ? 0 : 1, ((CharSequence) AbstractC13480e.m3570break(arrayList)).length() == 0 ? AbstractC6874e.billing(arrayList) : 1 + AbstractC6874e.billing(arrayList));
        }
    }
}
