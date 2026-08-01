package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۢۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9065e extends C14272e {
    @Override // defpackage.C14272e
    public final Font mopub(C14959e c14959e) {
        Font license;
        Uri uri = c14959e.ad;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c14959e.appmetrica;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (license = AbstractC17174e.license(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return license;
                }
                try {
                    return new Font.Builder(license).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
