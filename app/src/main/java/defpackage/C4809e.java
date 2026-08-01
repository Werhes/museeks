package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* renamed from: eِؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4809e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10448e f10250e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10251e;

    public /* synthetic */ C4809e(C10448e c10448e, int i) {
        this.f10251e = i;
        this.f10250e = c10448e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10251e) {
            case 0:
                C10448e c10448e = this.f10250e;
                C13475e c13475e = c10448e.smaato;
                InterfaceC8614e[] interfaceC8614eArr = C10448e.signatures;
                InterfaceC8614e interfaceC8614e = interfaceC8614eArr[10];
                Collection collection = (Collection) c13475e.invoke();
                C13475e c13475e2 = c10448e.loadAd;
                InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[12];
                return AbstractC13480e.m3584final(collection, (Collection) c13475e2.invoke());
            case 1:
                C10448e c10448e2 = this.f10250e;
                C13475e c13475e3 = c10448e2.amazon;
                InterfaceC8614e[] interfaceC8614eArr2 = C10448e.signatures;
                InterfaceC8614e interfaceC8614e3 = interfaceC8614eArr2[11];
                Collection collection2 = (Collection) c13475e3.invoke();
                C13475e c13475e4 = c10448e2.Signature;
                InterfaceC8614e interfaceC8614e4 = interfaceC8614eArr2[13];
                return AbstractC13480e.m3584final(collection2, (Collection) c13475e4.invoke());
            case 2:
                C10448e c10448e3 = this.f10250e;
                C13475e c13475e5 = c10448e3.smaato;
                InterfaceC8614e[] interfaceC8614eArr3 = C10448e.signatures;
                InterfaceC8614e interfaceC8614e5 = interfaceC8614eArr3[10];
                Collection collection3 = (Collection) c13475e5.invoke();
                C13475e c13475e6 = c10448e3.amazon;
                InterfaceC8614e interfaceC8614e6 = interfaceC8614eArr3[11];
                return AbstractC13480e.m3584final(collection3, (Collection) c13475e6.invoke());
            default:
                C10448e c10448e4 = this.f10250e;
                C13475e c13475e7 = c10448e4.admob;
                InterfaceC8614e[] interfaceC8614eArr4 = C10448e.signatures;
                InterfaceC8614e interfaceC8614e7 = interfaceC8614eArr4[14];
                Collection collection4 = (Collection) c13475e7.invoke();
                C13475e c13475e8 = c10448e4.subscription;
                InterfaceC8614e interfaceC8614e8 = interfaceC8614eArr4[15];
                return AbstractC13480e.m3584final(collection4, (Collection) c13475e8.invoke());
        }
    }
}
