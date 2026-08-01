package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7134e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15797e f14606e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14607e;

    public /* synthetic */ C7134e(C15797e c15797e, int i) {
        this.f14607e = i;
        this.f14606e = c15797e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.f14607e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    int m2467class = AbstractC8703e.m2467class(this.f14606e.ad);
                    if (m2467class == 0) {
                        i = R.string.mixes_v2_by_tag;
                    } else if (m2467class == 1) {
                        i = R.string.mixes_v2_by_album;
                    } else if (m2467class == 2) {
                        i = R.string.mixes_v2_by_playlist;
                    } else if (m2467class == 3) {
                        i = R.string.mixes_v2_by_track;
                    } else {
                        if (m2467class != 4) {
                            throw new C14803e(10);
                        }
                        i = R.string.mixes_v2_by_artist;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f14606e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
