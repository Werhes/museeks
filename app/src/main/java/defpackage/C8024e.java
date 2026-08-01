package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8024e {
    public final C12742e ad = new C12742e();

    public static void vip(C8024e c8024e, Function2 function2, C2892e c2892e, Function0 function0, int i) {
        if ((i & 8) != 0) {
            c2892e = null;
        }
        c8024e.ad.add(new C2892e(-1789283891, true, new C12050e(function2, c8024e, c2892e, function0, 19)));
    }

    public final void ad(C12776e c12776e, C13770e c13770e, int i) {
        c13770e.m3671package(-798501095);
        int i2 = (c13770e.purchase(c12776e) ? 4 : 2) | i | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C12742e c12742e = this.ad;
            int size = c12742e.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((Function3) c12742e.get(i3)).invoke(c12776e, c13770e, Integer.valueOf(i2 & 14));
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, c12776e, i, 18);
        }
    }
}
