package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1049e implements InterfaceC11129e {
    public final /* synthetic */ C9155e metrica;

    public C1049e(C9155e c9155e) {
        this.metrica = c9155e;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: const, reason: not valid java name */
    public final boolean mo456const() {
        return true;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean contains(String str) {
        return this.metrica.vip("a") != null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final List mo457e(String str) {
        return this.metrica.vip(str);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public final Set mo458e() {
        return this.metrica.mo458e();
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final String mo459e(String str) {
        List vip = this.metrica.vip("a");
        if (vip == null) {
            return null;
        }
        return vip.isEmpty() ? BuildConfig.FLAVOR : (String) AbstractC13480e.m3591interface(vip);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final /* bridge */ void mo460e(Function2 function2) {
        AbstractC1786e.ad(this, function2);
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean isEmpty() {
        return this.metrica.isEmpty();
    }

    @Override // defpackage.InterfaceC4023e
    public final Set mopub() {
        return this.metrica.mopub();
    }
}
