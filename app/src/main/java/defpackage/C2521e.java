package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2521e implements InterfaceC6395e, InterfaceC12504e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f6363e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Object f6364e;

    public /* synthetic */ C2521e(Object obj, Serializable serializable) {
        this.f6364e = obj;
        this.f6363e = serializable;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        ((InterfaceC8524e) obj).subscription(((Integer) this.f6363e).intValue(), (C1962e) this.f6364e);
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C4956e c4956e = (C4956e) this.f6364e;
        for (Map.Entry entry : ((HashMap) this.f6363e).entrySet()) {
            ((C2417e) ((InterfaceC2361e) c4956e.f10516e)).loadAd(((Integer) entry.getValue()).intValue(), EnumC2962e.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
