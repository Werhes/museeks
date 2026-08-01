package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eُٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11329e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17485e f22775e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f22776e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9864e f22777e;

    public C11329e(C9864e c9864e, boolean z, C17485e c17485e) {
        this.f22777e = c9864e;
        this.f22776e = z;
        this.f22775e = c17485e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        C9864e c9864e = this.f22777e;
        C4956e c4956e = c9864e.ad;
        InterfaceC15498e interfaceC15498e = (InterfaceC15498e) c4956e.f10512e;
        InterfaceC18372e interfaceC18372e = (InterfaceC18372e) ((C18277e) c4956e.f10517e).appmetrica;
        AbstractC7919e ad = c9864e.ad(interfaceC15498e);
        if (ad != null) {
            boolean z = this.f22776e;
            C17485e c17485e = this.f22775e;
            list = z ? AbstractC13480e.m3575continue(interfaceC18372e.smaato(ad, c17485e)) : AbstractC13480e.m3575continue(interfaceC18372e.mopub(ad, c17485e));
        } else {
            list = null;
        }
        return list == null ? C13664e.f27089e : list;
    }
}
