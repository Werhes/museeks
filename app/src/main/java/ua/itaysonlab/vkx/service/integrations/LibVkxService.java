package com.werhes.museeks.service.integrations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.BinderC14522e;
import defpackage.BinderC18041e;
import defpackage.C10053e;
import defpackage.C10284e;
import defpackage.C12309e;
import defpackage.C15409e;
import defpackage.InterfaceC8614e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkx/service/integrations/LibVkxService;", "Landroid/app/Service;", "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LibVkxService extends Service {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f36554e = AbstractC6874e.startapp(new C10284e(0), new C10284e(1));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Object obj;
        String str;
        C15409e c15409e = C15409e.ad;
        c15409e.getClass();
        C12309e c12309e = C15409e.loadAd;
        InterfaceC8614e interfaceC8614e = C15409e.vip[9];
        if (((Boolean) c12309e.tapsense(c15409e)).booleanValue()) {
            Iterator it = this.f36554e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C10284e c10284e = (C10284e) obj;
                    String action = intent != null ? intent.getAction() : null;
                    switch (c10284e.ad) {
                        case 0:
                            str = "bruhcollective.itaysonlab.libvkx.LIBVKX_SERVICE";
                            break;
                        default:
                            str = "ru.ytkab0bp.vkmusic.BIND_EXTERNAL_SERVICE";
                            break;
                    }
                    if (AbstractC7890e.billing(action, str)) {
                    }
                } else {
                    obj = null;
                }
            }
            C10284e c10284e2 = (C10284e) obj;
            if (c10284e2 != null) {
                C10053e c10053e = new C10053e(getApplicationContext());
                switch (c10284e2.ad) {
                    case 0:
                        return new BinderC14522e(c10053e);
                    default:
                        return new BinderC18041e(c10053e);
                }
            }
        }
        return null;
    }
}
