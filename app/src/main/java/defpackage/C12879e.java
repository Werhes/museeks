package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.car.app.mopub;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12879e implements InterfaceC11929e, InterfaceC8759e, InterfaceC6995e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f25725e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f25726e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f25727e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Object f25728e;

    public /* synthetic */ C12879e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f25726e = obj;
        this.f25728e = obj2;
        this.f25725e = obj3;
        this.f25727e = obj4;
    }

    @Override // defpackage.InterfaceC6995e
    public void ad(C18424e c18424e) {
        C5537e c5537e = (C5537e) this.f25726e;
        C11858e c11858e = (C11858e) this.f25728e;
        Bundle bundle = (Bundle) this.f25725e;
        ResultReceiver resultReceiver = (ResultReceiver) this.f25727e;
        C6584e c6584e = c5537e.yandex;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        ListenableFuture pro = c6584e.pro(c18424e, c11858e, bundle);
        if (resultReceiver != null) {
            pro.ad(new RunnableC7410e(pro, resultReceiver, 19), EnumC3320e.f7489e);
        }
    }

    @Override // defpackage.InterfaceC8759e
    public Object call() {
        mopub mopubVar = (mopub) this.f25726e;
        String str = (String) this.f25728e;
        String str2 = (String) this.f25725e;
        InterfaceC12623e interfaceC12623e = (InterfaceC12623e) this.f25727e;
        IInterface ad = mopubVar.ad(str);
        if (ad != null) {
            return interfaceC12623e.adcel(ad);
        }
        Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(str2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // defpackage.InterfaceC11929e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C1410e vip(int r17, defpackage.C16437e r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12879e.vip(int, eٖۗٙ, int[]):eؒۢۗ");
    }
}
