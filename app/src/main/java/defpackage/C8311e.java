package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8311e extends AbstractC5735e {
    public final /* synthetic */ int appmetrica;
    public final /* synthetic */ C2362e purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8311e(C10756e c10756e, String str, C2362e c2362e, Bundle bundle) {
        super(str);
        this.appmetrica = 2;
        this.purchase = c2362e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8311e(String str, C2362e c2362e, int i) {
        super(str);
        this.appmetrica = i;
        this.purchase = c2362e;
    }

    @Override // defpackage.AbstractC5735e
    public final void ad() {
        switch (this.appmetrica) {
            case 0:
                ((MediaBrowserService.Result) this.purchase.f5914e).detach();
                return;
            case 1:
                ((MediaBrowserService.Result) this.purchase.f5914e).detach();
                return;
            default:
                ((MediaBrowserService.Result) this.purchase.f5914e).detach();
                return;
        }
    }

    @Override // defpackage.AbstractC5735e
    public final void license(Object obj) {
        List list;
        switch (this.appmetrica) {
            case 0:
                List<C11531e> list2 = (List) obj;
                if (list2 == null) {
                    list = Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (C11531e c11531e : list2) {
                        Parcel obtain = Parcel.obtain();
                        c11531e.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    list = arrayList;
                }
                this.purchase.m814e(list);
                return;
            case 1:
                C11531e c11531e2 = (C11531e) obj;
                C2362e c2362e = this.purchase;
                if (c11531e2 == null) {
                    c2362e.m814e(null);
                    return;
                }
                Parcel obtain2 = Parcel.obtain();
                c11531e2.writeToParcel(obtain2, 0);
                c2362e.m814e(obtain2);
                return;
            default:
                List<C11531e> list3 = (List) obj;
                C2362e c2362e2 = this.purchase;
                if (list3 == null) {
                    c2362e2.m814e(null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C11531e c11531e3 : list3) {
                    Parcel obtain3 = Parcel.obtain();
                    c11531e3.writeToParcel(obtain3, 0);
                    arrayList2.add(obtain3);
                }
                c2362e2.m814e(arrayList2);
                return;
        }
    }
}
