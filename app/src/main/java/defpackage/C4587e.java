package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4587e implements InterfaceC8498e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public C4587e(C3168e c3168e) {
        this.ad = 1;
        this.vip = new LinkedHashSet();
        c3168e.m1261e("androidx.savedstate.Restarter", this);
    }

    public C4587e(AppActivity appActivity) {
        this.ad = 0;
        this.vip = appActivity;
    }

    @Override // defpackage.InterfaceC8498e
    public final Bundle ad() {
        switch (this.ad) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppActivity) this.vip).loadAd().getClass();
                return bundle;
            default:
                Bundle vip = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
                List m3575continue = AbstractC13480e.m3575continue((LinkedHashSet) this.vip);
                vip.putStringArrayList("classes_to_restore", m3575continue instanceof ArrayList ? (ArrayList) m3575continue : new ArrayList<>(m3575continue));
                return vip;
        }
    }
}
