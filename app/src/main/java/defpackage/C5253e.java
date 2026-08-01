package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: eؗۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5253e implements PrivilegedAction {
    public final /* synthetic */ int ad;
    public final /* synthetic */ String vip;

    public /* synthetic */ C5253e(String str, int i) {
        this.ad = i;
        this.vip = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.ad) {
            case 0:
                return Security.getProperty(this.vip);
            default:
                return System.getProperty(this.vip);
        }
    }
}
