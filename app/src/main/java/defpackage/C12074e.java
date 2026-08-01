package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12074e extends AbstractC0453e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f24191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12074e(int i, int i2) {
        super(i);
        this.f24191e = i2;
    }

    @Override // defpackage.AbstractC0453e
    public Object ad(Object obj) {
        switch (this.f24191e) {
            case 2:
                C14195e c14195e = (C14195e) obj;
                ArrayList arrayList = c14195e.ad;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5676e.ad.mo360e((int[]) it.next());
                }
                arrayList.clear();
                return c14195e;
            case 3:
                int[] iArr = (int[]) obj;
                AbstractC1660e.tapsense(-1, 0, 6, iArr);
                return iArr;
            default:
                return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [eٜٓۘ, java.lang.Object] */
    @Override // defpackage.AbstractC0453e
    public final Object license() {
        switch (this.f24191e) {
            case 0:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                ?? obj = new Object();
                obj.ad = new ArrayList();
                return obj;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }
}
