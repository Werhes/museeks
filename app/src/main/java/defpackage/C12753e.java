package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12753e extends AbstractC1798e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final BreakIterator f25512e;

    public C12753e(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f25512e = characterInstance;
    }

    @Override // defpackage.AbstractC1798e
    public final int amazon(int i) {
        return this.f25512e.preceding(i);
    }

    @Override // defpackage.AbstractC1798e
    public final int mopub(int i) {
        return this.f25512e.following(i);
    }
}
