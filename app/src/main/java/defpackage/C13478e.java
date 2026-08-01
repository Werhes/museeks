package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13478e implements InterfaceC12179e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8574e f26750e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4886e f26751e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f26752e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f26753e;

    public C13478e(C14826e c14826e, C4886e c4886e, C8574e c8574e, C4246e c4246e) {
        this.f26753e = c14826e;
        this.f26751e = c4886e;
        this.f26750e = c8574e;
        this.f26752e = c4246e;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        switch (AbstractC16960e.ad[enumC14621e.ordinal()]) {
            case 1:
                AbstractC5336e.purchase(this.f26753e, null, 4, new C7914e(this.f26752e, this.f26750e, interfaceC16400e, this, null, 12), 1);
                return;
            case 2:
                C4886e c4886e = this.f26751e;
                if (c4886e != null) {
                    C5609e c5609e = (C5609e) c4886e.f10364e;
                    synchronized (c5609e.f11962e) {
                        try {
                            if (!c5609e.amazon()) {
                                ArrayList arrayList = (ArrayList) c5609e.f11964e;
                                c5609e.f11964e = (ArrayList) c5609e.f11961e;
                                c5609e.f11961e = arrayList;
                                c5609e.f11963e = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC5083e) arrayList.get(i)).billing(Unit.INSTANCE);
                                }
                                arrayList.clear();
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f26750e.m2448implements();
                return;
            case 3:
                this.f26750e.m2446extends();
                return;
            case 4:
                this.f26750e.subs();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new C14803e(10);
        }
    }
}
