package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347e implements InterfaceC3464e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14595e f2382e = new C14595e(10);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C4622e f2383e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public LocaleList f2384e;

    @Override // defpackage.InterfaceC3464e
    public final C4622e appmetrica() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f2382e) {
            C4622e c4622e = this.f2383e;
            if (c4622e != null && localeList == this.f2384e) {
                return c4622e;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new C0768e(localeList.get(i)));
            }
            C4622e c4622e2 = new C4622e(arrayList);
            this.f2384e = localeList;
            this.f2383e = c4622e2;
            return c4622e2;
        }
    }
}
