package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15810e {
    public static final C5363e ad = new C5363e(new C13117e(23));
    public static final C5363e vip = new C5363e(new C13117e(24));
    public static final C5363e metrica = new C5363e(new C13117e(25));

    public static final C8885e ad(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new C8885e((ZoneOffset) dateTimeFormatter.parse(str, new Object()));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
