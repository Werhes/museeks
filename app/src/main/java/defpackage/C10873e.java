package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10873e implements InterfaceC9391e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C10873e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC9391e
    public final void ad(String str, String str2, Bundle bundle, long j) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                C17659e c17659e = (C17659e) obj;
                if (((HashSet) c17659e.f34613e).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC12614e abstractC12614e = AbstractC10945e.ad;
                    String smaato = AbstractC15367e.smaato(str2, AbstractC12992e.yandex, AbstractC12992e.metrica);
                    if (smaato != null) {
                        str2 = smaato;
                    }
                    bundle2.putString("events", str2);
                    ((C16911e) c17659e.f34612e).m4217interface(2, bundle2);
                    return;
                }
                return;
            default:
                if (str == null || AbstractC10945e.ad.contains(str2)) {
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("name", str2);
                bundle3.putLong("timestampInMillis", j);
                bundle3.putBundle("params", bundle);
                ((C16911e) ((C8167e) obj).f16626e).m4217interface(3, bundle3);
                return;
        }
    }
}
