package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14501e implements InterfaceC18018e {
    public final /* synthetic */ ArrayList ad;
    public final /* synthetic */ C11467e vip;

    public C14501e(ArrayList arrayList, C11467e c11467e) {
        this.ad = arrayList;
        this.vip = c11467e;
    }

    public final void ad(int i, int i2, Function0 function0) {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.ad.add(new C16438e(i2, VKXApplication.Companion.vip(i), false, new C5163e(function0, this.vip, 1)));
    }
}
