package defpackage;

import android.os.Bundle;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C16554e implements InterfaceC7898e, InterfaceC0987e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f32481e;

    public C16554e(C11177e c11177e) {
        Charset charset = AbstractC9561e.ad;
        this.f32481e = c11177e;
        c11177e.vip = this;
    }

    public void ad(int i, Object obj, InterfaceC0627e interfaceC0627e) {
        C11177e c11177e = (C11177e) this.f32481e;
        AbstractC4191e abstractC4191e = (AbstractC4191e) obj;
        c11177e.yandex(i, 2);
        c11177e.admob(abstractC4191e.ad(interfaceC0627e));
        interfaceC0627e.billing(abstractC4191e, this);
    }

    @Override // defpackage.InterfaceC0987e
    public ListenableFuture call() {
        UserManager userManager = AbstractC16603e.ad;
        RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e((Callable) this.f32481e);
        EnumC3320e.f7489e.execute(runnableFutureC9859e);
        return runnableFutureC9859e;
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        ((C8033e) this.f32481e).getClass();
        AbstractC12220e.Signature("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }
}
