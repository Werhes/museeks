package defpackage;

import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkapi2.internal.objects.VKError;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0907e extends Exception {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ int f3315e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f3316e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f3317e;

    public C0907e(String str, List list) {
        this.f3317e = str;
        this.f3316e = list;
    }

    public C0907e(String str, VKError vKError) {
        this(str, Collections.singletonList(vKError));
    }

    public final VKError ad() {
        return (VKError) AbstractC13480e.m3591interface(this.f3316e);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return vip();
    }

    public final String vip() {
        StringBuilder sb = new StringBuilder("[VE] Method: ");
        sb.append(this.f3317e);
        sb.append(" / Error: ");
        sb.append(ad().vip);
        sb.append(" [");
        return AbstractC17861e.smaato(ad().ad, "]\n", sb);
    }
}
