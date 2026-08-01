package defpackage;

import j$.util.DesugarCollections;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: eؙؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6107e implements CertPathParameters {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final List f12814e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Date f12815e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Set f12816e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5300e f12817e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Map f12818e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Date f12819e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f12820e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final PKIXParameters f12821e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f12822e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Map f12823e;

    public C6107e(C8765e c8765e) {
        this.f12821e = (PKIXParameters) c8765e.f17669e;
        this.f12815e = (Date) c8765e.f17667e;
        this.f12819e = (Date) c8765e.f17671e;
        this.f12814e = DesugarCollections.unmodifiableList((ArrayList) c8765e.f17675e);
        this.f12823e = DesugarCollections.unmodifiableMap(new HashMap((HashMap) c8765e.f17674e));
        this.f12822e = DesugarCollections.unmodifiableList((ArrayList) c8765e.f17670e);
        this.f12818e = DesugarCollections.unmodifiableMap(new HashMap((HashMap) c8765e.f17672e));
        this.f12817e = (C5300e) c8765e.f17666e;
        this.f12820e = c8765e.f17673e;
        this.f12816e = DesugarCollections.unmodifiableSet((Set) c8765e.f17668e);
    }

    @Override // java.security.cert.CertPathParameters
    public final Object clone() {
        return this;
    }
}
