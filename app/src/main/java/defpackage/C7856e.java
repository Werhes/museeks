package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7856e implements InterfaceC7106e {
    public final ArrayList ad;

    public C7856e(ArrayList arrayList) {
        this.ad = arrayList;
    }

    @Override // defpackage.InterfaceC7106e
    public final C5401e ad(SessionConfiguration sessionConfiguration) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            C5401e ad = ((InterfaceC7106e) it.next()).ad(sessionConfiguration);
            if (ad.f11581e != 0) {
                return ad;
            }
        }
        return new C5401e(0, 4, (byte) 0);
    }
}
