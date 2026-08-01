package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12003e extends AbstractC7884e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f24004e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f24005e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final String m3308e() {
        m2347e();
        return this.f24004e;
    }

    @Override // defpackage.AbstractC7884e
    /* renamed from: eؚۚۦ */
    public final boolean mo487e() {
        Calendar calendar = Calendar.getInstance();
        this.f24005e = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f24004e = AbstractC8647e.ads(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final long m3309e() {
        m2347e();
        return this.f24005e;
    }
}
