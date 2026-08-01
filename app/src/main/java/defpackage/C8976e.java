package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8976e implements InterfaceC11129e, InterfaceC4023e {
    public final List license;
    public final String metrica;

    public C8976e(String str, List list) {
        this.metrica = str;
        this.license = list;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: const */
    public final boolean mo456const() {
        return true;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean contains(String str) {
        return "a".equalsIgnoreCase(this.metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4023e)) {
            return false;
        }
        InterfaceC4023e interfaceC4023e = (InterfaceC4023e) obj;
        if (true != interfaceC4023e.mo456const()) {
            return false;
        }
        return mopub().equals(interfaceC4023e.mopub());
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍۢؒ */
    public final List mo457e(String str) {
        if (AbstractC6507e.loadAd(this.metrica, str, true)) {
            return this.license;
        }
        return null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ */
    public final Set mo458e() {
        return Collections.singleton(this.metrica);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eؙِۡ */
    public final String mo459e(String str) {
        if ("a".equalsIgnoreCase(this.metrica)) {
            return (String) AbstractC13480e.m3604this(this.license);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍٓۢ */
    public final void mo460e(Function2 function2) {
        function2.invoke(this.metrica, this.license);
    }

    public final int hashCode() {
        return mopub().hashCode() + 1182991;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC4023e
    public final Set mopub() {
        return Collections.singleton(new C9239e(this));
    }

    public final String toString() {
        return "Parameters " + mopub();
    }
}
