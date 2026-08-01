package com.werhes.museeks.startup;

import android.content.Context;
import android.os.Build;
import defpackage.AbstractC11575e;
import defpackage.AbstractC14966e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC1876e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC5087e;
import defpackage.C10776e;
import defpackage.C13630e;
import defpackage.C13664e;
import defpackage.C5363e;
import defpackage.InterfaceC16294e;
import defpackage.InterfaceC6832e;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/startup/CoreInitializer;", "Leؙۨۚ;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreInitializer implements InterfaceC6832e {
    public final C5363e ad = new C5363e(new C13630e(29));

    @Override // defpackage.InterfaceC6832e
    public final Object ad(Context context) {
        AbstractC1876e.ad.add(new Object());
        Object obj = new Object();
        C10776e[] c10776eArr = AbstractC14966e.vip;
        int length = c10776eArr.length;
        Object[] copyOf = Arrays.copyOf(c10776eArr, length + 1);
        copyOf[length] = obj;
        AbstractC14966e.vip = (C10776e[]) copyOf;
        StringBuilder sb = new StringBuilder("[vkx-version] 8.12.1_pub / [os] ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" / [device] ");
        AbstractC14966e.ad(AbstractC11575e.vip(this), 4, AbstractC1786e.signatures(sb, Build.DEVICE, " / by iTaysonLab"), null);
        for (InterfaceC16294e interfaceC16294e : (List) this.ad.getValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            interfaceC16294e.ad(context);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb2 = new StringBuilder("Initialized ");
            sb2.append(AbstractC3820e.ad.vip(interfaceC16294e.getClass()).mopub());
            sb2.append(" in ");
            AbstractC14966e.ad(AbstractC11575e.vip(this), 4, AbstractC5087e.m1750native(currentTimeMillis2, " ms", sb2), null);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC6832e
    public final List vip() {
        return C13664e.f27089e;
    }
}
