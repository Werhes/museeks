package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0709e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C6943e f2998e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11210e f2999e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3000e;

    public /* synthetic */ C0709e(C6943e c6943e, C11210e c11210e) {
        this.f3000e = 0;
        this.f2998e = c6943e;
        this.f2999e = c11210e;
    }

    public /* synthetic */ C0709e(C11210e c11210e, C6943e c6943e, int i) {
        this.f3000e = i;
        this.f2999e = c11210e;
        this.f2998e = c6943e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        switch (this.f3000e) {
            case 0:
                C6943e c6943e = this.f2998e;
                Iterator it = c6943e.license.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C2567e) obj).metrica == EnumC8272e.f16948e) {
                        }
                    } else {
                        obj = null;
                    }
                }
                C2567e c2567e = (C2567e) obj;
                if (c2567e == null) {
                    c2567e = (C2567e) AbstractC13480e.m3604this(c6943e.license);
                }
                if (c2567e != null) {
                    this.f2999e.m3061import(c6943e, c2567e);
                }
                return Unit.INSTANCE;
            case 1:
                C11210e c11210e = this.f2999e;
                AbstractC16519e.vip((AppActivity) c11210e.pro(), new C1247e(c11210e, this.f2998e, (InterfaceC5083e) null, 10));
                return Unit.INSTANCE;
            default:
                AbstractC2745e.vip((AppActivity) this.f2999e.pro(), new C12851e(21, this.f2998e));
                return Unit.INSTANCE;
        }
    }
}
