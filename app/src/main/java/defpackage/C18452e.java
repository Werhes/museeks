package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18452e implements CharacterIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f36162e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f36163e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CharSequence f36164e;

    public C18452e(CharSequence charSequence, int i) {
        this.f36164e = charSequence;
        this.f36163e = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f36162e;
        if (i == this.f36163e) {
            return (char) 65535;
        }
        return this.f36164e.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f36162e = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f36163e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f36162e;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f36163e;
        if (i == 0) {
            this.f36162e = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f36162e = i2;
        return this.f36164e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f36162e + 1;
        this.f36162e = i;
        int i2 = this.f36163e;
        if (i < i2) {
            return this.f36164e.charAt(i);
        }
        this.f36162e = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f36162e;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f36162e = i2;
        return this.f36164e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f36163e || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f36162e = i;
        return current();
    }
}
